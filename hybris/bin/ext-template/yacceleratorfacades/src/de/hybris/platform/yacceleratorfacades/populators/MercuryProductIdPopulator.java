/**
 *
 */
package de.hybris.platform.yacceleratorfacades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;


/**
 * @author lenovo
 *
 */
public class MercuryProductIdPopulator
		/* extends SearchResultProductPopulator */ implements Populator<SearchResultValueData, ProductData>
{


	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		//super.populate(source, target);

		if (source.getValues().get("mercuryId_int") != null)
		{
			final Integer mercuryId = (Integer) source.getValues().get("mercuryId_int");
			target.setMercuryId(mercuryId.intValue());
		}

	}

}
