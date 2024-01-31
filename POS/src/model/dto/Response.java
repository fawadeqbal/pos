
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
            if(m.type == MessageType.Error || m.type == MessageType.Exception)
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
            if(m.type == MessageType.Error || m.type == MessageType.Exception)
                sb.append(m.message);
        }
        return sb.toString();
    }
    
    public String getInfoMessages() {
        StringBuilder sb = new StringBuilder();    
        for(Message m : messagesList)
        {
           if(sb.length() > 0) 
               sb.append(",\n");
            if(m.type == MessageType.Information)
                sb.append(m.message);
        }
        return sb.toString();
    }

    public boolean isSuccessfull() {
        return !hasError();
    }
}
