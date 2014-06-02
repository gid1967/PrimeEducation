/**
 * Created by gid_000 on 02.06.14.
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class ButtonView {

    public void buttonAction(ActionEvent actionEvent) {
        addMessage("Здравствуй , о дружелюбная форма жизни  пришедшая на мой  сайт !!!  !!!  ");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}