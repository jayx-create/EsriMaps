import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class RotationMap {

@When("Customer authenticates the API key for location")
  public void customerAuthenticatesTheAPIKeyForLocation(){
    String yourAPIKey = System.getProperty("apiKey");
      ArcGISRuntimeEnvironment.setApiKey(yourAPIKey);
  }

@Then("User points the compass north on ARCGIS")
  public void userPointsTheCompassNorthOnARCGIS(){
    
