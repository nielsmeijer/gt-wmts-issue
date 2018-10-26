/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import javax.xml.namespace.QName;

import net.opengis.wfs20.UpdateActionType;

/**
 * A sample validator interface for {@link net.opengis.wfs20.ValueReferenceType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ValueReferenceTypeValidator {
  boolean validate();

  boolean validateValue(QName value);
  boolean validateAction(UpdateActionType value);
}
