package org.apache.xalan.lib.sql;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.DOMException;
import org.apache.xalan.utils.UnImplNode;
import org.apache.xpath.patterns.NodeTestFilter;
import org.apache.xpath.patterns.NodeTest;
import org.apache.xalan.res.XSLTErrorResources;

/**
 * This is the superclass for all nodes in the Xalan sql package.
 */
public class StreamableNode extends UnImplNode 
  implements NodeTestFilter, NamedNodeMap
{
  private XStatement m_statement;
  
  public XStatement getXStatement()
  {
    return m_statement;
  }
  
  private NodeTest m_nodetest;
  
  public NodeTest getNodeTest()
  {
    return m_nodetest;
  }
  
  public StreamableNode(XStatement statement)
  {
    m_statement = statement;
  }
  
  public void setNodeTest(NodeTest nodeTest)
  {
    m_nodetest = nodeTest;
  }
  
  public Document getOwnerDocument()
  {
    return m_statement;
  }

  /**
   * Streamable nodes default to being elements.
   */
  public short getNodeType()
  {
    return Node.ELEMENT_NODE;
  }
  
  /**
   * Return "#Document".
   */
  public String       getLocalName()
  {
    return getNodeName();
  }

  /**
   * Returns null.
   */
  public String             getNamespaceURI()
  {
    return null;
  }

  /** Returns null. */
  public String             getPrefix()
  {
    return null;
  }
  
  public NamedNodeMap       getAttributes()
  {
    return this;
  }

  public Node getNamedItem(String name)
  {
    return null;
  }
    
  public Node item(int index)
  {
    return null;
  }

  public int getLength()
  {
    return 0;
  }

  public Node getNamedItemNS(String namespaceURI, 
                             String localName)
  {
    return null;
  }
  
  public Node setNamedItem(Node arg)
    throws DOMException
  {
    error(XSLTErrorResources.ER_FUNCTION_NOT_SUPPORTED); 
    return null;
  }
  
  public Node removeNamedItem(String name)
    throws DOMException
  {
    error(XSLTErrorResources.ER_FUNCTION_NOT_SUPPORTED); 
    return null;
  }
  
  public Node setNamedItemNS(Node arg)
    throws DOMException
  {
    error(XSLTErrorResources.ER_FUNCTION_NOT_SUPPORTED); 
    return null;
  }
  
  public Node removeNamedItemNS(String namespaceURI, 
                                String localName)
    throws DOMException
  {
    error(XSLTErrorResources.ER_FUNCTION_NOT_SUPPORTED); 
    return null;
  }
}
