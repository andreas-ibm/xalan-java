/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2002-2004 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xalan" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, Lotus
 * Development Corporation., http://www.lotus.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xalan.templates;

import org.apache.xpath.XPathVisitor;

/**
 * A derivation from this class can be passed to a class that implements 
 * the XSLTVisitable interface, to have the appropriate method called 
 * for each component of an XSLT stylesheet.  Aside from possible other uses,
 * the main intention is to provide a reasonable means to perform expression 
 * rewriting.
 */
public class XSLTVisitor extends XPathVisitor
{
	/**
	 * Visit an XSLT instruction.  Any element that isn't called by one 
	 * of the other visit methods, will be called by this method.
	 * 
	 * @param elem The xsl instruction element object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitInstruction(ElemTemplateElement elem)
	{
		return true;
	}
	
	/**
	 * Visit an XSLT stylesheet instruction.
	 * 
	 * @param elem The xsl instruction element object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitStylesheet(ElemTemplateElement elem)
	{
		return true;
	}

	
	/**
	 * Visit an XSLT top-level instruction.
	 * 
	 * @param elem The xsl instruction element object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitTopLevelInstruction(ElemTemplateElement elem)
	{
		return true;
	}
	
	/**
	 * Visit an XSLT top-level instruction.
	 * 
	 * @param elem The xsl instruction element object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitTopLevelVariableOrParamDecl(ElemTemplateElement elem)
	{
		return true;
	}

	
	/**
	 * Visit an XSLT variable or parameter declaration.
	 * 
	 * @param elem The xsl instruction element object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitVariableOrParamDecl(ElemVariable elem)
	{
		return true;
	}
	
	/**
	 * Visit a LiteralResultElement.
	 * 
	 * @param elem The literal result object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitLiteralResultElement(ElemLiteralResult elem)
	{
		return true;
	}
	
	/**
	 * Visit an Attribute Value Template (at the top level).
	 * 
	 * @param owner The owner of the expression, to which the expression can 
	 *              be reset if rewriting takes place.
	 * @param elem The attribute value template object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitAVT(AVT elem)
	{
		return true;
	}


	/**
	 * Visit an extension element.
	 * @param elem The extension object.
	 * @return true if the sub expressions should be traversed.
	 */
	public boolean visitExtensionElement(ElemExtensionCall elem)
	{
		return true;
	}

}

