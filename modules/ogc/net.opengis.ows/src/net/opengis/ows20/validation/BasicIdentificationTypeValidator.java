/**
 *
 * $Id$
 */
package net.opengis.ows20.validation;

import net.opengis.ows20.CodeType;
import net.opengis.ows20.MetadataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link net.opengis.ows20.BasicIdentificationType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BasicIdentificationTypeValidator {
  boolean validate();

  boolean validateIdentifier(CodeType value);
  boolean validateMetadataGroup(FeatureMap value);
  boolean validateMetadata(EList<MetadataType> value);
}
