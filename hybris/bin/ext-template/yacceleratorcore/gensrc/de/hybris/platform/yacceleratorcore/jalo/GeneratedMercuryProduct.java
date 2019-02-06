/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 5, 2019 4:47:30 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.yacceleratorcore.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.yacceleratorcore.constants.YAcceleratorCoreConstants;
import de.hybris.platform.yacceleratorcore.jalo.ApparelProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.yacceleratorcore.jalo.MercuryProduct MercuryProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMercuryProduct extends ApparelProduct
{
	/** Qualifier of the <code>MercuryProduct.mercuryId</code> attribute **/
	public static final String MERCURYID = "mercuryId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ApparelProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MERCURYID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MercuryProduct.mercuryId</code> attribute.
	 * @return the mercuryId
	 */
	public Integer getMercuryId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MERCURYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MercuryProduct.mercuryId</code> attribute.
	 * @return the mercuryId
	 */
	public Integer getMercuryId()
	{
		return getMercuryId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @return the mercuryId
	 */
	public int getMercuryIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMercuryId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @return the mercuryId
	 */
	public int getMercuryIdAsPrimitive()
	{
		return getMercuryIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @param value the mercuryId
	 */
	public void setMercuryId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MERCURYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @param value the mercuryId
	 */
	public void setMercuryId(final Integer value)
	{
		setMercuryId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @param value the mercuryId
	 */
	public void setMercuryId(final SessionContext ctx, final int value)
	{
		setMercuryId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MercuryProduct.mercuryId</code> attribute. 
	 * @param value the mercuryId
	 */
	public void setMercuryId(final int value)
	{
		setMercuryId( getSession().getSessionContext(), value );
	}
	
}
