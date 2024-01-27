
package model.dto;

import java.util.ArrayList;

/**
 *
 * @author fawad
 */
public class Response {
    public ArrayList<Message> messagesList;
    public Response(){ 
        messagesList = new ArrayList<>();
    }

    public boolean hasError() {
        for(Message m : messagesList)
        {
            if(m.Type == MessageType.Error || m.Type == MessageType.Exception)
                return true;
        }
        return false;
}

    public String getErrorMessages() {
        StringBuilder sb = new StringBuilder();    
        for(Message m : messagesList)
        {
           if(sb.length() > 0) 
               sb.append(",\n");
            if(m.Type == MessageType.Error || m.Type == MessageType.Exception)
                sb.append(m.Message);
        }
        return sb.toString();
    }
    
    public String getInfoMessages() {
        StringBuilder sb = new StringBuilder();    
        for(Message m : messagesList)
        {
           if(sb.length() > 0) 
               sb.append(",\n");
            if(m.Type == MessageType.Information)
                sb.append(m.Message);
        }
        return sb.toString();
    }

    public boolean isSuccessfull() {
        return !hasError();
    }
}
