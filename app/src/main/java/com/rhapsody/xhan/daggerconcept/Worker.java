package com.rhapsody.xhan.daggerconcept;

import javax.inject.Inject;

/**
 * @todo: add class description
 */
public class Worker {
	public int id;

	@Inject
	public Worker () {
		id =-2;
	}

	public Worker (int id) {
		this.id = id;
	}
}
