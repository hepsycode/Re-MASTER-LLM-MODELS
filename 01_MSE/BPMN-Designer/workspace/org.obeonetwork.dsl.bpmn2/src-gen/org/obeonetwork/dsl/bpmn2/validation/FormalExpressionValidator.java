/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.FormalExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FormalExpressionValidator {
	boolean validate();

	boolean validateLanguage(String value);

	boolean validateBody(EObject value);

	boolean validateEvaluatesToTypeRef(ItemDefinition value);
}
