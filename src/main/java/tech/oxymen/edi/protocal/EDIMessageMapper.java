package tech.oxymen.edi.protocal;

import java.io.File;
import java.util.Map;

public interface EDIMessageMapper {
    
    /**
     * Map send message to comply the format from partner.
     */
    public File mapSendMessage(Map<String, String> data); 

    
    /**
     * Map received message from partner to our format.
     */
    public Map<String, Object> mapReceivedMessage(File ediFile);
   
}
