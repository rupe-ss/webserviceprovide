package com.webservice.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@WebService
@SOAPBinding
(style=Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED) // --- Docum
//(style=Style.DOCUMENT, parameterStyle = ParameterStyle.BARE)

public class CalculatorWebService {
	public int addition( int num1, int num2) {
		System.out.println(num1 + num2);
		return num1+num2;
	}
}
