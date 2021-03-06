/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.openapi.core.exception;

import javax.ws.rs.core.Response;

/**
 * @author Igor Beslic
 * @author Matija Petanjek
 * @author Zoltán Takács
 * @author Alessio Antonio Rendina
 */
public enum RESTError {

	ACCOUNT_NAME_ERROR(
		956, "Invalid account name", Response.Status.BAD_REQUEST),
	ADDRESS_CITY_ERROR(
		961, "Invalid address city", Response.Status.BAD_REQUEST),
	ADDRESS_COUNTRY_ERROR(
		960, "Invalid address country", Response.Status.BAD_REQUEST),
	ADDRESS_NAME_ERROR(
		959, "Invalid address name", Response.Status.BAD_REQUEST),
	ADDRESS_STREET_ERROR(
		958, "Invalid address street", Response.Status.BAD_REQUEST),
	ADDRESS_ZIP_ERROR(957, "Invalid address zip", Response.Status.BAD_REQUEST),
	COUNTRY_NAME_ERROR(
		977, "Invalid country name for given language tag",
		Response.Status.BAD_REQUEST),
	CURRENCY_CODE_ERROR(
		976, "Invalid currency code", Response.Status.BAD_REQUEST),
	CURRENCY_NAME_ERROR(
		975, "Invalid currency name for given language tag",
		Response.Status.BAD_REQUEST),
	DUPLICATE_ACCOUNT(981, "Duplicate account", Response.Status.CONFLICT),
	DUPLICATE_PRICE_ENTRY(
		988, "Duplicated price entry", Response.Status.CONFLICT),
	DUPLICATE_PRODUCT_OPTION_KEY(
		993, "Duplicate product option key.", Response.Status.CONFLICT),
	DUPLICATE_PRODUCT_OPTION_VALUE_KEY(
		991, "Duplicate product option value key.", Response.Status.CONFLICT),
	GENERAL_ERROR(999, "General error.", Response.Status.BAD_REQUEST),
	INTERNAL_ERROR(
		998, "Internal error. Please try again later.",
		Response.Status.INTERNAL_SERVER_ERROR),
	INVALID_COMMERCE_PRICE_LIST_DISPLAY_DATE(
		995, "Invalid commerce price list display date.",
		Response.Status.BAD_REQUEST),
	INVALID_COMMERCE_PRICE_LIST_EXPIRATION_DATE(
		994, "Invalid commerce price list expiration date.",
		Response.Status.BAD_REQUEST),
	NO_SUCH_CURRENCY(
		996,
		"Unable to find currency. Currency code should be expressed with " +
			"3-letter ISO 4217 format.",
		Response.Status.NOT_FOUND),
	NO_SUCH_MODEL(982, "Unable to find entity", Response.Status.NOT_FOUND),
	ORDER_BILLING_ADDRESS_ERROR(
		970, "Invalid order billing address", Response.Status.BAD_REQUEST),
	ORDER_NOTE_CONTENT_ERROR(
		967, "Invalid order note content", Response.Status.BAD_REQUEST),
	ORDER_PAYMENT_METHOD_ERROR(
		966, "Invalid order payment method", Response.Status.BAD_REQUEST),
	ORDER_PRICE_ERROR(965, "Invalid order price", Response.Status.BAD_REQUEST),
	ORDER_SHIPPING_ADDRESS_ERROR(
		969, "Invalid order shipping address", Response.Status.BAD_REQUEST),
	ORDER_SHIPPING_METHOD_ERROR(
		968, "Invalid order shipping method", Response.Status.BAD_REQUEST),
	ORDER_STATUS_ERROR(
		963, "Invalid order status", Response.Status.BAD_REQUEST),
	ORDER_VALIDATOR_ERROR(955, "Invalid order", Response.Status.BAD_REQUEST),
	PRINCIPAL_ERROR(
		983, Response.Status.NOT_FOUND.getReasonPhrase(),
		Response.Status.NOT_FOUND),
	PRODUCT_TYPE_NAME_ERROR(
		980, "Unable to find product type.", Response.Status.BAD_REQUEST),
	PURCHASE_ORDER_NUMBER_ERROR(
		964, "Invalid purchase order number", Response.Status.BAD_REQUEST),
	REGION_NAME_ERROR(962, "Invalid region name", Response.Status.BAD_REQUEST),
	SEARCH_ERROR(
		986, "Unable to fix the search index after 10 attempts",
		Response.Status.INTERNAL_SERVER_ERROR),
	THREE_LETTERS_COUNTRY_ISO_CODE_ERROR(
		979, "Invalid ISO 3166-1 three letter country code",
		Response.Status.BAD_REQUEST),
	TWO_LETTERS_COUNTRY_ISO_CODE_ERROR(
		978, "Invalid ISO 3166-1 two letter country code",
		Response.Status.BAD_REQUEST);

	public int getErrorCode() {
		return _errorCode;
	}

	public String getErrorDescription() {
		return _errorDescription;
	}

	public Response.Status getStatus() {
		return _status;
	}

	private RESTError(
		int errorCode, String errorDescription, Response.Status status) {

		_errorCode = errorCode;
		_errorDescription = errorDescription;
		_status = status;
	}

	private final int _errorCode;
	private final String _errorDescription;
	private final Response.Status _status;

}