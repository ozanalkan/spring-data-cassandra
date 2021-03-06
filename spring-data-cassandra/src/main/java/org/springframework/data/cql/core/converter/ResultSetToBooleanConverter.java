/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cql.core.converter;

import org.springframework.core.convert.converter.Converter;

import com.datastax.driver.core.ResultSet;

/**
 * {@link Converter} from {@link ResultSet} to a single {@link Boolean} value.
 *
 * @author Mark Paluch
 */
public class ResultSetToBooleanConverter extends AbstractResultSetToBasicFixedTypeConverter<Boolean> {

	public static final ResultSetToBooleanConverter INSTANCE = new ResultSetToBooleanConverter();

	/* (non-Javadoc)
	 * @see org.springframework.data.cql.core.converter.AbstractResultSetConverter#doConvertSingleValue(java.lang.Object)
	 */
	@Override
	protected Boolean doConvertSingleValue(Object object) {
		return CONVERTER.convert(object, Boolean.class);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.cql.core.converter.AbstractResultSetConverter#getType()
	 */
	@Override
	protected Class<?> getType() {
		return Boolean.class;
	}
}
