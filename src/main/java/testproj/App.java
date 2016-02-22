package testproj;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        checkFasterXML();
        checkCodehaus();

    }

    private static void checkFasterXML() throws Exception {
        DummyDTOFasterXML.Child.GrandChild grandChild = new DummyDTOFasterXML.Child.GrandChild();
        grandChild.setSubject("mysubject");

        DummyDTOFasterXML.Child child = new DummyDTOFasterXML.Child();
        child.setEmail("myemail");
        child.setGrandChild(grandChild);

        DummyDTOFasterXML dto = new DummyDTOFasterXML();
        dto.setChild(child);
        dto.setLogin("mylogin");


        ObjectMapper objectMapper = new ObjectMapper();
        String ret = objectMapper.writeValueAsString(dto);

        System.out.println(ret);

        DummyDTOFasterXML retDTO = objectMapper.readValue(ret, DummyDTOFasterXML.class);

        System.out.println(retDTO.getChild().getGrandChild().getSubject());
        System.out.println(retDTO.getChild().getEmail());
        System.out.println(retDTO.getLogin());
    }

    private static void checkCodehaus() throws Exception {
        DummyDTOCodehaus.Child.GrandChild grandChild = new DummyDTOCodehaus.Child.GrandChild();
        grandChild.setSubject("mysubject2");

        DummyDTOCodehaus.Child child = new DummyDTOCodehaus.Child();
        child.setEmail("myemail2");
        child.setGrandChild(grandChild);

        DummyDTOCodehaus dto = new DummyDTOCodehaus();
        dto.setChild(child);
        dto.setLogin("mylogin2");

        org.codehaus.jackson.map.ObjectMapper objectMapper = new org.codehaus.jackson.map.ObjectMapper();
        String ret = objectMapper.writeValueAsString(dto);

        System.out.println(ret);

        DummyDTOCodehaus retDTO = objectMapper.readValue(ret, DummyDTOCodehaus.class);

        System.out.println(retDTO.getChild().getGrandChild().getSubject());
        System.out.println(retDTO.getChild().getEmail());
        System.out.println(retDTO.getLogin());
    }
}
