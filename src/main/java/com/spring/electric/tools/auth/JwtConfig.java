package com.spring.electric.tools.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA ="alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAnba9JbiOezb+c65+wZ75xJBWR5aFScqRhVsvYdCHVT9fxX+9\r\n" + 
			"txmlXYZiwo7VINuCiFR88gSjCiz5M0Z2/ezGtVGAcuhnEe0pdfxPfNk4rxsCzYvE\r\n" + 
			"YyygdSzH28OrC6WWciifAzxYJdB2dwp8+e5Zz29SvJL/clkvyH1AvWIg0ithbjql\r\n" + 
			"7dFmaQ/N+EBQW/fDjchgt2l3JBLKaU3rvnF8R9Ta3Nu/y3ONNyaobkvmJGuO5oM8\r\n" + 
			"xxPAY+dOj6GM6AZYoBKSFd9AKGvtzlxDZgVRcdpcATApsWyEI61UN/cFAn1m6Rzr\r\n" + 
			"wkvndnbpfRfQy4A9Ww1zXlW77MsX9oCoicFXeQIDAQABAoIBADfdONaZru56Jlt3\r\n" + 
			"nbKby0ETF1y4NnJS7ITeLcRqBuXtUtE0VFD9JpQgO+9KhLfkyTHdK3zWo6HBGGxP\r\n" + 
			"M2ryadhkDCmnpIq3BQ6j1swUbX2pBa8lKOUwM44N1KVFg9rWRpodRWXyBA8w7iVw\r\n" + 
			"c6BcCzfs6NOfBhjM+p37r+jlT1biNGj0EAebJMYHNHDEcaHofD1IwjPLd6ahuOiN\r\n" + 
			"GJt9cmRcxs2xpp08Lv2+HK705S3y/cNeH996T4aDfImYmj5XBaAPbVMPGLfX22pq\r\n" + 
			"axyXQ31w0Q0qyt0Wbv+dznxhhn3fOUrn24hMsXxy1q7iOdTiBOQtCPy6QCmbfKUe\r\n" + 
			"bJchg+ECgYEA0G2uMS+2iLMeJ0beC/LSemWHcb5Vh0qbrF/IserYhJNjndYJ9KFt\r\n" + 
			"GQeLho9ZpCWixf52Iip5mxnuLunnxdCwAjc60L1JlDaEmgR2lthsgpkGYgfsKHUc\r\n" + 
			"/pmAkStqHSWqdPdj6qHYGL9WIq8+yQd0qGxLZ8EDGMA7FTbyiUuEUEUCgYEAwbXX\r\n" + 
			"R6/BfgrbxEq6Ie8Q+IveN9ESk1jSUpIcbTtYw89cAgtsk6mQdB7gKWyXptMLywUT\r\n" + 
			"4idUhuXwiEodsQwTLa7QVEwppUBv/giD1yGnAs1mWrtmuFfMuwvUx+CMm/9uthsW\r\n" + 
			"HllJjRv2gWXjsofQGaOubNEB8q+v8c2G0yfwX6UCgYEAoROigzC0iICk1QXXpLRM\r\n" + 
			"JXtBaY4G2z+1f0mm+JjeK9ccLWa02vHGNom2Mo+mX00Wtp0o/s6EnHE1udva2u2k\r\n" + 
			"mJHGSnt+2aQoZj78xycK9QL+A9TLlZish7Zpvccngs8RJMPr2/Cn6Lg2ASgeBY5V\r\n" + 
			"gbPvsodftUkaYBLO7XwHDWECgYBOGvz/ya0yHjy4rAzbC+MC5JqoVOOxh9neM03E\r\n" + 
			"+W30HhMSO/r+mxtExwJJkaCgQm554MVApe0eK27N9Vx9e8nr3JXht4f/Orkta8+F\r\n" + 
			"GeuWZK2FnhRv9e716HJWWYM4j0jbopZLjGLsw76kNCoYXUyaWfZFqAyqBw7hZ6aa\r\n" + 
			"U3tHhQKBgCmFZ7UhsRrh/4zdvn64D7c2m5OX/4Jxgz3JdGlYSBlYodvJs71PIsi8\r\n" + 
			"ULh67lv4qtSZQuep5pOQ0i3YI/J4BeDT/bDE29QRp9TkT3aQOHD02XwBg4SuZG0F\r\n" + 
			"WtjWhVN/dCMdvNmFCobrKlj5RXcVQ2oT0mmX+esN1Gx+j2Lf7fye\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnba9JbiOezb+c65+wZ75\r\n" + 
			"xJBWR5aFScqRhVsvYdCHVT9fxX+9txmlXYZiwo7VINuCiFR88gSjCiz5M0Z2/ezG\r\n" + 
			"tVGAcuhnEe0pdfxPfNk4rxsCzYvEYyygdSzH28OrC6WWciifAzxYJdB2dwp8+e5Z\r\n" + 
			"z29SvJL/clkvyH1AvWIg0ithbjql7dFmaQ/N+EBQW/fDjchgt2l3JBLKaU3rvnF8\r\n" + 
			"R9Ta3Nu/y3ONNyaobkvmJGuO5oM8xxPAY+dOj6GM6AZYoBKSFd9AKGvtzlxDZgVR\r\n" + 
			"cdpcATApsWyEI61UN/cFAn1m6RzrwkvndnbpfRfQy4A9Ww1zXlW77MsX9oCoicFX\r\n" + 
			"eQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
