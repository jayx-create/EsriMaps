import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class LogInSteps {
  
  
@Given("{string} is logged into Cal Poly Pomona portal")
  public void loginProfileIdIsLoggedIn(String loginProfileId) throws Exception{
   baseUtil.userInformation = TestUserUtil.getTestUserByProfileId(loginProfileId);
   realData = baseutil.userInformation;
   name = realData.getUserName();
   switch(deviceMode.toUpperCase()) {
     case GlobalConstant.DESKTOP:
       if ( expectedLanguage.equals("English"){
         cppPortal.invoke(username);
         cppPortal.waitForPageToLoad();
       }
       else if( expectedLanguage.equals("Spanish"){
         cppPortal.invoke(username);
         cppPortal.waitForPageToLoad();
   }
 }           
 @And ("User is registered with {string}")
  public void userIsRegisteredWithLanguage(String language) throws Exception{
  if(userLanguage. equalsIgnoreCase (GlobalConstant.ENGLISH)) {
baseutil.deviceProp.setPreferredLanguage(GlobalConstant.ENGLISH);
if(!dataType.toUpperCase().contains (GlobalConstant.DATA_TYPE_VIRTUAL)) {
changeUserPreferredLanguage(GlobalConstant.ENGLISH_PREFFERED_LANG_CODE)
  }
    }
 }
else if(userLanguage.equalsIgnoreCase(GlobalConstant.SPANISH)){
baseUtil.deviceProp.setPreferredLanguage(GlobalConstant.SPANISH);
if (!dataType.toUpperCase().contains (GlobalConstant.DATA_TYPE_VIRTUAL)) {
changeUserPreferredLanguage(GlobalConstant.SPANISH_PREFFERED_LANG_CODE);
     }
}
}
}
}
