/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project439;

import org.xtext.project439.GroceryStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GroceryStandaloneSetup extends GroceryStandaloneSetupGenerated {
  public static void doSetup() {
    new GroceryStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
