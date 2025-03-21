/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.bpmdi.validation;

import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape;
import org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BPMNShapeValidator {
	boolean validate();

	boolean validateBpmnElement(BaseElement value);

	boolean validateIsHorizontal(boolean value);

	boolean validateIsExpanded(boolean value);

	boolean validateIsMarkerVisible(boolean value);

	boolean validateLabel(BPMNLabel value);

	boolean validateIsMessageVisible(boolean value);

	boolean validateParticipantBandKind(ParticipantBandKind value);

	boolean validateChoreographyActivityShape(BPMNShape value);
}
