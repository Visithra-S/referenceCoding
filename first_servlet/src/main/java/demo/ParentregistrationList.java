package demo;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.json.JSONObject;

import com.centris.campus.delegate.ParentBD;
import com.centris.campus.pojo.ParentPojo;

public class ParentregistrationList extends Action {
	private static final Logger logger = Logger.getLogger(ParentregistrationList.class);

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
			
		logger.info("Starting");
		try {
			List<ParentPojo> status=new ParentBD().getParentregistrationList();
			
			JSONObject object = new JSONObject();
			object.put("list", status);
			response.getWriter().print(object);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		logger.info("Ending");
		
		
		return null;
	}
	
	
}
