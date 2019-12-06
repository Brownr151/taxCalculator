Siamak 29/11/2019 15:04

# Tax year fix

I had to change couple of classes:
* `MainController.java` was incomplete and was causing compiler errors - this was fixed to stop failing but is not the end product.
* `CalculatorController.java` changed the class to expect the new `int taxyear` parameter.
* Change the `resultspage.scala.html` page template parameter from `@(finalamount: Double)` to `@(finalamount: String)`.
* Changed the route file and added `otherincome: Double` and `taxyear: String` to `\calculator` route.

