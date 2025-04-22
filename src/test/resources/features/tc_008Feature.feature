Feature: Validar inclusión y contenido de la columna 'IVA retenido'

  Scenario: Validar la columna 'IVA retenido' en el reporte Excel
    Given el reporte es exportado y el documento Excel es abierto
    When ubico la columna 'IVA retenido'
    Then la columna 'IVA retenido' es visible en el documento
    And los montos en la columna corresponden a los valores retenidos según los cálculos internos