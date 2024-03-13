package rds.capella.btree.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.platform.sirius.ui.navigator.view.CapellaCommonNavigator;
import rds.capella.btree.data.BehaviourTree.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.gmf.runtime.notation.Node;

public class NavigateToBTreeActionFunction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();

        if (page == null) {
            return null;
        }
        IEditorPart activeEditor = page.getActiveEditor();
        
        IViewPart view = page.findView("capella.project.explorer");
        org.polarsys.capella.core.platform.sirius.ui.navigator.view.CapellaCommonNavigator browser = (CapellaCommonNavigator)view;

      	 ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
                 .getActivePage().getSelection();
      	 

       	
       	Action action = null;
       	
       	
      	 if (selection instanceof StructuredSelection) {
      		 
      		StructuredSelection structured_sel = (StructuredSelection)selection;
      		Object obj = structured_sel.getFirstElement();
      		
      		if (obj instanceof DNodeEditPart) {
      			
      			DNodeEditPart node_part = (DNodeEditPart)obj;
      			EObject target = node_part.resolveTargetSemanticElement();
      			if (target instanceof Action) {
      				
      				action = (Action)target;
      			}
      		} else
      			if (obj instanceof Action) {
      				action = (Action)obj;
      			}
      		 
      	 }
      		 
      	
      	if (action != null) {
      		AbstractFunction fnc_to_navigate = action.getFunction();
      		
      		if (fnc_to_navigate != null) {
	      		
				window.getShell().getDisplay().asyncExec
		          (new Runnable()
		           {
		             public void run()
		             {
		               ((ISetSelectionTarget)view).selectReveal(new StructuredSelection(fnc_to_navigate));
		             }
		           });
      		}
      	}
        
		return null;
	}
}
