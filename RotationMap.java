import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.toolkit.Compass;

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

@Then("User points the compass North on ARCGIS")
  public void userPointsTheCompassNorthOnARCGIS(){
    
