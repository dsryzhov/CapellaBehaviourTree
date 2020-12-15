package rds.capella.btree.design.service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.internal.view.AbstractLayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.LayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.ui.IEditorPart;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.core.data.ctx.CtxFactory;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.la.LaFactory;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.oa.OaFactory;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.pa.PaFactory;
import org.polarsys.capella.core.data.pa.PhysicalFunction;

public class BTreeService {
	public BTreeService() {
		
	}
	
	protected StringPropertyValue findBTreeNodeTypePrp(AbstractFunction fnc) {
		StringPropertyValue res_prp = null;
		for (AbstractPropertyValue prp : fnc.getOwnedPropertyValues()) {
			if (prp instanceof StringPropertyValue && prp.getName().equals("BTreeNodeType")) {
				res_prp = (StringPropertyValue) prp;
				break;
			}
		}
		return res_prp;
	}

	public boolean isBTreeContainerNode(CapellaElement element) {
		AbstractFunction fnc = (AbstractFunction) element;
		StringPropertyValue prp = findBTreeNodeTypePrp(fnc);

		if (prp != null) {
			//System.out.print("There is a prop with name BTreeNodeType");
			String val = prp.getValue();
			
			List<String> containerList = new ArrayList<String>();
			containerList.add("BTree");	
			containerList.add("Sequence");
			containerList.add("ReactiveSequence");
			containerList.add("SequenceStar");
			containerList.add("Fallback");
			containerList.add("ReactiveFallback");
			containerList.add("Parallel");
			containerList.add("Repeat");
			containerList.add("Retry");
			containerList.add("Inverter");
			containerList.add("ForceSuccess");
			containerList.add("ForceFailure");
			
			List<String> oneChildList = new ArrayList<String>();
			oneChildList.add("Repeat");
			oneChildList.add("BTree");
			oneChildList.add("Retry");
			oneChildList.add("Inverter");
			oneChildList.add("ForceSuccess");
			oneChildList.add("ForceFailure");
			
			
			if (containerList.contains(val)) {
				int count = fnc.getOwnedFunctions().size();
				if (oneChildList.contains(val) && count >= 1) return false;
				else
				   return true;
			}
			else
				return false;
		}
		else 
			return true;
		
		
	}
	
	public boolean checkBTreeNodeType(AbstractFunction fnc, String btree_node_type) {
		boolean res = false;
		StringPropertyValue prp = findBTreeNodeTypePrp(fnc);
		if (prp != null) {
			String val = prp.getValue();
			if (val.equals(btree_node_type)) res = true;
		}
		return res;
	
	}
	
	public boolean isBTreeSequenceGroup(AbstractFunction fnc) {
		StringPropertyValue prp = findBTreeNodeTypePrp(fnc);
		boolean res = false;
		if (prp != null) {
			String val = prp.getValue();
			List<String> typeList = new ArrayList<String>();
			typeList.add("Sequence");
			typeList.add("ReactiveSequence");
			if (typeList.contains(val)) res = true;
		}
		return res;
	}
	
	public boolean isBTreeDecoratorGroup(AbstractFunction fnc) {
		StringPropertyValue prp = findBTreeNodeTypePrp(fnc);
		boolean res = false;
		if (prp != null) {
			String val = prp.getValue();
			List<String> typeList = new ArrayList<String>();
			typeList.add("Repeat");
			typeList.add("Retry");
			typeList.add("Inverter");
			typeList.add("ForceSuccess");
			typeList.add("ForceFailure");
			
			if (typeList.contains(val)) res = true;
		}
		return res;
	}
	
	public boolean isBTreeFallbackGroup(AbstractFunction fnc) {
		StringPropertyValue prp = findBTreeNodeTypePrp(fnc);
		boolean res = false;
		if (prp != null) {
			String val = prp.getValue();
			List<String> typeList = new ArrayList<String>();
			typeList.add("Fallback");
			typeList.add("ReactiveFallback");
			if (typeList.contains(val)) res = true;
		}
		return res;
	}
	

	public void setNodePositionHint(DDiagramElement parentView) {
		
		  AbstractFunction fnc = (AbstractFunction )parentView.getTarget();
		  int subFnc_count = fnc.getOwnedFunctions().size();

		  // Give hints about location and size
		  IGraphicalEditPart editPart = getEditPart(parentView);
		  if (editPart instanceof ShapeEditPart) {
		    ShapeEditPart part = (ShapeEditPart)editPart;
		    
			Point pos = part.getLocation();
			
			AbstractFunction last_sub_fnc = findLastSubFunction(fnc);			
			if (last_sub_fnc != null) {
				
				  DNode last_sub_fnc_node = findElementDNode(parentView.getParentDiagram(), last_sub_fnc);
				  
				  if (last_sub_fnc_node != null) {
					  IGraphicalEditPart last_sub_fnc_editPart = getEditPart(last_sub_fnc_node);
					  
					  if (last_sub_fnc_editPart instanceof ShapeEditPart) {
						  
						  ShapeEditPart last_sub_fnc_part = (ShapeEditPart)last_sub_fnc_editPart;
						  Point last_sub_fnc_pos =  last_sub_fnc_part.getLocation();
						  //pos.y = last_sub_fnc_pos.y;
						  //pos.x = last_sub_fnc_pos.x + part.getSize().width + 30;
						  
						  pos.y = last_sub_fnc_pos.y + part.getSize().height + 20;
						  pos.x = pos.x + part.getSize().width+50;
					  
					  }
				  }
				  
			  } else {
				  //pos.y += 80;
				  pos.x += part.getSize().width+50;
			  }
		    SiriusLayoutDataManager.INSTANCE.addData((AbstractLayoutData)new RootLayoutData(parentView.eContainer(), pos, part.getSize()));
		  }
		  
		  
	}
	
	private AbstractFunction findLastSubFunction(AbstractFunction fnc) {
		
		AbstractFunction last_sub_fnc = null; 
				
		int subFnc_count = fnc.getOwnedFunctions().size();
		if (subFnc_count > 0) {
			 last_sub_fnc = fnc.getOwnedFunctions().get(subFnc_count-1);
			 
			 AbstractFunction child_last_sub_fnc = findLastSubFunction(last_sub_fnc);
			 if (child_last_sub_fnc != null) last_sub_fnc =  child_last_sub_fnc;
			
		} 
		return last_sub_fnc;
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
    
    
    
    private DNode findElementDNode(DDiagram diagram, AbstractFunction fnc) {
    	
    	DNode node = null;
    	
    	for (DDiagramElement d_element : diagram.getDiagramElements()) {
    		
    		if (d_element instanceof DNode) {
    			DNode n = (DNode) d_element;
    			if (n.getTarget().equals((EObject)fnc)) {
    				node = n;
    				break;
    			}
    		}
    	}
    	return node;
    }
    
    public AbstractFunction createBTreeNode(AbstractFunction parent_node, String node_type) {
    	AbstractFunction btree_node = null;
    	if (parent_node instanceof OperationalActivity) {
    		btree_node = OaFactory.eINSTANCE.createOperationalActivity();
    	}
    	if (parent_node instanceof SystemFunction) {
    		btree_node = CtxFactory.eINSTANCE.createSystemFunction();
    	} else
	    	if (parent_node instanceof LogicalFunction) {
	    		btree_node = LaFactory.eINSTANCE.createLogicalFunction();
	    	} 
	    	else 
	    		if (parent_node instanceof PhysicalFunction) {
		    		btree_node = PaFactory.eINSTANCE.createPhysicalFunction();
		    	}  
    		
    	if (btree_node != null) {
    		parent_node.getOwnedFunctions().add(btree_node);    		
    		btree_node.setName(node_type);    		
    		StringPropertyValue prp = CapellacoreFactory.eINSTANCE.createStringPropertyValue();
    		prp.setName("BTreeNodeType");
    		prp.setValue(node_type);
    		btree_node.getOwnedPropertyValues().add(prp);
    	}
    	return btree_node;
    }
    
    public String getFunctionType(AbstractFunction parent_node) {
    	String fnc_type = "AbstractFunction";
    	if (parent_node instanceof LogicalFunction) {
    		fnc_type = "LogicalFunction";
    	}
    	return fnc_type;
    }
}
