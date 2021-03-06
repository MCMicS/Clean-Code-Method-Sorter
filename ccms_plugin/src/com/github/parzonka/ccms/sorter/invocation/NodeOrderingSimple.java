/**
 * Copyright (c) 2011 Mateusz Parzonka
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package com.github.parzonka.ccms.sorter.invocation;

import java.util.ArrayList;
import java.util.List;

import com.github.parzonka.ccms.sorter.callgraph.CallGraphNode;

public class NodeOrderingSimple implements NodeOrdering {

    private final List<CallGraphNode> orderedNodes;

    public NodeOrderingSimple() {
	super();
	this.orderedNodes = new ArrayList<CallGraphNode>();
    }

    /**
     * Inserts each node at the end of the list.
     */
    @Override
    public void insert(CallGraphNode node) {
	if (contains(node))
	    return;
	this.orderedNodes.add(node);
    }

    @Override
    public boolean contains(CallGraphNode node) {
	return this.orderedNodes.contains(node);
    }

    @Override
    public List<CallGraphNode> getList() {
	return this.orderedNodes;
    }

}

