package org.eclipse.jgit.api.errors;

import org.eclipse.jgit.api.errors.GitAPIException;

/**
 * Thrown from StashApplyCommand when stash apply fails
 */
public class StashApplyFailureException extends GitAPIException {

	/**
	 * Create a StashApplyFailedException
	 *
	 * @param message
	 */
	public StashApplyFailureException(final String message) {
		super(message);
	}

}
