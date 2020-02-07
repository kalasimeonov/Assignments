/**
 * JobRoleTest.java
 */

package unit.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import source.CompanyPosition;


public class CompanyPositionTest {

  /**
   * Test accessors and mutators for a job role.
   */
  @Test
  public void testAccessorsMutators() {
    // Create a job companyPosition object.
    CompanyPosition companyPosition = new CompanyPosition();

    // Test setting and getting the company position.
    companyPosition.setPositionName("Senior Lecturer");
    assertEquals("Senior Lecturer", companyPosition.getPositionName());
  }
}
