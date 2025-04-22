package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.*;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el reporte es exportado y el documento Excel es abierto")
    public void exportReportAndOpenExcel() {
        page.exportReport();
        page.openExcelDocument();
    }

    @When("ubico la columna 'IVA retenido'")
    public void locateIvaRetenidoColumn() {
        assertTrue(page.isColumnIvaRetenidoPresent());
    }

    @Then("la columna 'IVA retenido' es visible en el documento")
    public void columnIvaRetenidoVisible() {
        assertTrue(page.isColumnVisible());
    }

    @Then("los montos en la columna corresponden a los valores retenidos según los cálculos internos")
    public void verifyIvaRetenidoValues() {
        assertTrue(page.areIvaRetenidoValuesCorrect());
    }
}