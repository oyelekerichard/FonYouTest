package fonyou.test.card_issuer_code_review;

import java.util.List;
import java.util.logging.Logger;


/*

CODE REVIEW FOR THIS CARDISSUER CODE

  1. to be able to declare a log for a class, we either call the @Slf4j ANNOTATION or wr declare the log variable S STATED here

     Logger log = Loggerfactory.getLogger(CardIssuer.class);

 2. to enable us access to all level of logging , we need to declare the log property in the application.properties file
 which is in the resources folder of this application

3. if we want to return the getRequiredCreditCardIssuer as an oBJECT TYPE OF CardIssuer, we need to declare the CardIssuer class with its
parameters and return it as so after tthe getRequiredCreditCardIssuer method has beed set to the CardIssuer class and its propeerties set to
same value to be returned

4.    the getAll() method called to return a list variable of cardIssuers  was not declared anywhere in the code and should have been declared
to return a List of String

5. the cardValidation.isActive() method was not declared anywhere in the code and is not accessible to be called or refrenced anywhere in the code

6. findFirst(cardIssuers, cardNumber, cardExpirationDate, cardCvv) method was only declared and called in the code when the functionality of the
 method has not been implemented anywhere in the code and is not accessible to be called , thereby the error thrown when the functionality
 was refrenced

 7. this CardIssuerNotFoundException(cardNumber, cardExpirationDate, cardCvv) exception should have been created, the constructor with these
 numbers of parameters declared and implemented in a class and should have been made to extend an Exception class so as to enable us
 use the exception in this code

 8. NumberUtils Class SHOULD BE CREATED as an enum class which would have the  IMOLEMENTED WITH THE INTEGER_ZERO declared before being
 called in this code
   */



/*

NOTE ::
THE METHOD getRequiredCreditCardIssuer was commented out to enable us run the remaining part of the project
 */

//    public CardIssuer getRequiredCreditCardIssuer(final String cardNumber, final String cardExpirationDate, final String cardCvv) {
//
////        log.debug("START - getRequiredCreditCardIssuer");
//
//        try {
//
//            List<String> cardIssuers = getAll();
//        } catch (Exception ex) {
//            log.error(ex);
//        }
//
//        //Check the flag that allows ignore card validation
//
//        if (cardValidation.isActive()) {
//
//
//            return findFirst(cardIssuers, cardNumber, cardExpirationDate, cardCvv).orElseThrow(()
//                    -> new CardIssuerNotFoundException(cardNumber, cardExpirationDate, cardCvv));
//        } else {
//            return findFirst(cardIssuers, cardNumber, cardExpirationDate, cardCvv).orElseGet(()
//                    -> new CardIssuer(Integer.valueOf(CardIssuerObfuscation.UNKNOWN.getId()), true, UNKNOWN, UNKNOWN, NumberUtils.INTEGER_ZERO, true));
//        }
//        log.debug("END - getRequiredCreditCardIssuer");
//    }
//}
