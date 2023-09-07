package demo;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.json.JSONObject;

import com.centris.campus.delegate.ParentBD;

public class SaveParentRegistration extends Action {
	private static final Logger logger = Logger.getLogger(SaveParentRegistration.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
			
		logger.info("Starting");
		try {
			//ParentForm sform=(ParentForm) form;
			
			String fathername = request.getParameter("name");
			
			System.out.println("fathername : "+fathername);
			
			String status=new ParentBD().saveParent(fathername);
			
			JSONObject object = new JSONObject();
			object.put("status", status);
			response.getWriter().print(object);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		logger.info("Ending");
		return null;
	}
}
