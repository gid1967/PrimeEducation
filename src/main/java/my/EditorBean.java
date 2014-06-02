package my;

/**
 * Created by gid_000 on 05.05.14.
 */

import org.primefaces.context.RequestContext;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "editor")
public class EditorBean {
    private static boolean rand = true;

    private String value = "";

    public String getValue() {
        EditorBean.rand = !EditorBean.rand;
        if(EditorBean.rand){
            RequestContext.getCurrentInstance().execute("PF('dlg1').show()");
        }

        return EditorBean.rand? "Success": "Fail";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void showModalDialog(ActionEvent actionEvent){
        System.out.println("showModalDialog");
        RequestContext.getCurrentInstance().execute("PF('dlgModal').show()");
    }
}