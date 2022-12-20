package rds.capella.btree.design.service;


import java.util.Map;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.AbstractLayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.ui.IEditorPart;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.ComponentArchitecture;
import org.polarsys.capella.core.data.cs.CsFactory;
import org.polarsys.capella.core.data.ctx.CtxFactory;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.la.LaFactory;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.core.data.pa.PaFactory;
import org.polarsys.capella.core.data.pa.PhysicalFunction;
import org.polarsys.capella.core.data.pa.PhysicalFunctionPkg;

import rds.capella.btree.data.BehaviourTree.Action;
import rds.capella.btree.data.BehaviourTree.BTreeContainer;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;
import rds.capella.btree.data.BehaviourTree.BTreeElement;
import rds.capella.btree.data.BehaviourTree.BTreeLeaf;
import rds.capella.btree.data.BehaviourTree.BTreeNode;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;

public class BTreeNativeService {
	public BTreeNativeService() {
		
	}

	public String getLeafNodeLabel(BTreeLeaf leaf_node) {
		String res = "";
		if (leaf_node.getFunction() != null) res=leaf_node.getFunction().getName();
		else res=leaf_node.getName();
		return res;
	}
	
	public void changeNodeParent(BTreeNode element, BTreeNode source, BTreeNode target) {
		if (source instanceof BTreeContainer && target instanceof BTreeContainer) {
			((BTreeContainer)source).getOwnedNodes().remove(element);
			((BTreeContainer)target).getOwnedNodes().add(element);
		} else
			if (source instanceof BTreeContainer && target instanceof BTreeDecorator) {
				((BTreeContainer)source).getOwnedNodes().remove(element);
				((BTreeDecorator)target).setOwnedNode(element);
			} else
				if (source instanceof BTreeDecorator && target instanceof BTreeContainer) {
					((BTreeDecorator)source).setOwnedNode(null);
					((BTreeContainer)target).getOwnedNodes().add(element);
				} 
	}
	
	public boolean checkBTreeNodeRelationExist(BTreeElement parent, BTreeElement child) {
		boolean res = false;
		if (parent instanceof BTreeRoot && child instanceof BTreeNode) {
			BTreeRoot root = (BTreeRoot) parent;
			if (root.getOwnedBTreeContainer() == child) res = true;

		} else 
			if (parent instanceof BTreeContainer && child instanceof BTreeNode) {
				BTreeContainer container = (BTreeContainer) parent;
				if (child.eContainer() == container) res = true;
				
			}
		return res;
	}

	public void setBTreeNodePositionHint(DDiagramElement parentView) {
		
		  BTreeElement element = (BTreeElement )parentView.getTarget();
		  

		  // Give hints about location and size
		  IGraphicalEditPart editPart = getEditPart(parentView);
		  if (editPart instanceof ShapeEditPart) {
		    ShapeEditPart part = (ShapeEditPart)editPart;
		    
			Point pos = part.getLocation();
			Dimension dim = new Dimension(part.getSize());

			BTreeNode last_sub_node = findLastSubNodeReqursive(element);
			
			if (last_sub_node != null) {
				
				  DNode last_sub_fnc_node = findElementDNode(parentView.getParentDiagram(), last_sub_node);
				  
				  if (last_sub_fnc_node != null) {
					  IGraphicalEditPart last_sub_fnc_editPart = getEditPart(last_sub_fnc_node);
					  
					  if (last_sub_fnc_editPart instanceof ShapeEditPart) {
						  
						  ShapeEditPart last_sub_fnc_part = (ShapeEditPart)last_sub_fnc_editPart;
						  Point last_sub_fnc_pos =  last_sub_fnc_part.getLocation();
						  //pos.y = last_sub_fnc_pos.y;
						  //pos.x = last_sub_fnc_pos.x + part.getSize().width + 30;
						  
						  pos.y = last_sub_fnc_pos.y + part.getSize().height + 20;
						  //pos.x = pos.x + 20;//part.getSize().width+0;
					  }
				  }
				  
			  } else {
				  //pos.y += 80;
				  //pos.x += 20;//part.getSize().width+0;
			  }

			BTreeNode last_sub_node_1level = findLastSubNodeOneLevel(element);
			if (last_sub_node_1level != null) {
				DNode last_sub_fnc_node = findElementDNode(parentView.getParentDiagram(), last_sub_node_1level);
				  if (last_sub_fnc_node != null) {
					  IGraphicalEditPart last_sub_fnc_editPart = getEditPart(last_sub_fnc_node);
					  
					  if (last_sub_fnc_editPart instanceof ShapeEditPart) {
						  
						  ShapeEditPart last_sub_fnc_part = (ShapeEditPart)last_sub_fnc_editPart;
						  Point last_sub_fnc_pos =  last_sub_fnc_part.getLocation();
						  pos.x = last_sub_fnc_pos.x;// + part.getSize().width + 20+20;
						  dim.setSize(last_sub_fnc_part.getSize());
					  }
				  }
				
			} else pos.x += part.getSize().width+20+20;
			
			
			//pos.x += part.getSize().width+20;
		    SiriusLayoutDataManager.INSTANCE.addData((AbstractLayoutData)new RootLayoutData(parentView.eContainer(), pos, dim));
		  }
		  
		  
	}

	private BTreeNode findLastSubNodeOneLevel(BTreeElement element) {
		
		BTreeNode last_sub_node = null; 
		
		if (element instanceof BTreeRoot) 
			last_sub_node = ((BTreeRoot)element).getOwnedBTreeContainer();
		else {
			if (element instanceof BTreeContainer) {
						
				int child_count = ((BTreeContainer)element).getOwnedNodes().size();
				if (child_count > 0) {
					 last_sub_node = ((BTreeContainer)element).getOwnedNodes().get(child_count-1);
				} 
			} else 
			  if (element instanceof BTreeLeaf) {
				  return (BTreeNode) element;
				  
			  }
		}
		return last_sub_node;
	}
	
	
	private BTreeNode findLastSubNodeReqursive(BTreeElement element) {
		
		BTreeNode last_sub_node = null; 
		
		if (element instanceof BTreeRoot) 
			last_sub_node = ((BTreeRoot)element).getOwnedBTreeContainer();
		else {
			if (element instanceof BTreeContainer) {
						
				int child_count = ((BTreeContainer)element).getOwnedNodes().size();
				if (child_count > 0) {
					 last_sub_node = ((BTreeContainer)element).getOwnedNodes().get(child_count-1);
					 
					 BTreeNode child_last_sub_node = findLastSubNodeReqursive((BTreeElement)last_sub_node);
					 if (child_last_sub_node != null) last_sub_node =  child_last_sub_node;
					
				} 
			} else 
			  if (element instanceof BTreeLeaf) {
				  return (BTreeNode) element;
				  
			  }
		}
		return last_sub_node;
	}
	
	
    private IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
        IEditorPart editor = EclipseUIUtil.getActiveEditor();
         if (editor instanceof DiagramEditor) {
             Session session = new EObjectQuery(diagramElement).getSession();
             View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);
	
             IGraphicalEditPart result = null;
             if (gmfView != null && editor instanceof DiagramEditor) {
            	 
            	 DiagramEditor de = (DiagramEditor) editor;
            	 
                 final Map<?, ?> editPartRegistry = de.getDiagramGraphicalViewer().getEditPartRegistry();
                 final Object editPart = editPartRegistry.get(gmfView);
                 if (editPart instanceof IGraphicalEditPart) {
                     result = (IGraphicalEditPart) editPart;
                     return result;
                 }
             }
         }
         return null;
     }	
    
    
    
    private DNode findElementDNode(DDiagram diagram, BTreeNode btree_node) {
    	
    	DNode node = null;
    	
    	for (DDiagramElement d_element : diagram.getDiagramElements()) {
    		
    		if (d_element instanceof DNode) {
    			DNode n = (DNode) d_element;
    			if (n.getTarget().equals((EObject)btree_node)) {
    				node = n;
    				break;
    			}
    		}
    	}
    	return node;
    }
    
    public AbstractFunction findRootFunction(CapellaElement element) {
    	
    	AbstractFunction root_fnc = null;
    	CapellaElement parent;
    	parent = element;
    	while (!(parent.eContainer() instanceof SystemEngineering || parent.eContainer() instanceof AbstractFunction )) parent = (CapellaElement) parent.eContainer();
    	
    	if (parent instanceof ComponentArchitecture) {
    		ComponentArchitecture ca = (ComponentArchitecture)parent;
    		
    		
    		FunctionPkg fnc_pkg = ca.getOwnedFunctionPkg();
    		
    		if (fnc_pkg instanceof SystemFunctionPkg) {
    			root_fnc = ((SystemFunctionPkg)fnc_pkg).getOwnedSystemFunctions().get(0);
    		} else
	    		if (fnc_pkg instanceof LogicalFunctionPkg) {
	    			root_fnc = ((LogicalFunctionPkg)fnc_pkg).getOwnedLogicalFunctions().get(0);
	    		}
	    		else
		    		if (fnc_pkg instanceof PhysicalFunctionPkg) {
		    			root_fnc = ((PhysicalFunctionPkg)fnc_pkg).getOwnedPhysicalFunctions().get(0);
		    		}

    	} else 
    		if (parent.eContainer() instanceof AbstractFunction) {
    			root_fnc = (AbstractFunction) parent.eContainer();
    		}
    	return root_fnc;
    }
   
    public AbstractFunction createBtreeActionFunction(Action btree_action_node) {
    	
    	AbstractFunction root_fnc = findRootFunction(btree_action_node);
    	if (root_fnc != null) {
    		AbstractFunction node_fnc = null;
    		if (root_fnc instanceof SystemFunction) {
    			node_fnc = CtxFactory.eINSTANCE.createSystemFunction();
    		}
    		else
	    		if (root_fnc instanceof LogicalFunction) {
	    			node_fnc = LaFactory.eINSTANCE.createLogicalFunction();
	    		}
		    		if (root_fnc instanceof PhysicalFunction) {
		    			node_fnc = PaFactory.eINSTANCE.createPhysicalFunction();
		    		}
    		
		    if (node_fnc != null) { 
				node_fnc.setName(btree_action_node.getName());
				root_fnc.getOwnedFunctions().add(node_fnc);
				return node_fnc;
		    }
    	}
    	return null;
    }
}
