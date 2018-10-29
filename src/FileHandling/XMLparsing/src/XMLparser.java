import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class XMLparser
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try{
		File fXmlFile = new File("sitcoms.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		//Element el=doc.getDocumentElement();//root
		NodeList nodeList= doc.getElementsByTagName("name");
		for(int i=0;i<nodeList.getLength();i++){
			Node node=nodeList.item(i);
			if(node.getTextContent().equals("Perfect Strangers")){
				//System.out.println(node.getParentNode().getTextContent());
				NodeList nl=node.getParentNode().getChildNodes();
				for(int j=0;j<nl.getLength();j++){
					Node n=nl.item(j);
				if(n.getNodeType()==Node.ELEMENT_NODE)
					System.out.println(n.getNodeType()+" "+n.getNodeName()+": "+n.getTextContent());
				}
			}
//			int length = nl.getLength();
//			System.out.println(node.getNodeName());
//			System.out.println("length"+length);
//		    for (int j = 0; j < length;j++) {
//		    	
//		      if(nl.item(j).getNodeType()==1){
//		   System.out.println(nl.item(j)+" "+nl.item(j).getNodeType());
//		   System.out.println(node.getTextContent());
		      }
		    	  /*if(node.getChildNodes().getLength()>0){
				NodeList childList=node.getChildNodes();
				for(int j=0;i<childList.getLength();i++){
					Node childNode=childList.item(i);
					System.out.println(childNode.getNodeName());
					System.out.println(childNode.getTextContent());
			}*/
//			if(node.getNodeType()==Node.ELEMENT_NODE){
//				Element el=(Element) node;
//				System.out.println(el.getElementsByTagName("characters").);
//			}
		    
		}
		    
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}

}
}
