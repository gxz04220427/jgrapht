/*
 * (C) Copyright 2003-2016, by Assaf Lehr and Contributors. 
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht.graph;

import org.jgrapht.VertexFactory;

/**
 * Default implementation of a vertex factory which creates integers. The vertices start by default
 * from zero.
 * 
 * @author Assaf Lehr
 */
public class IntegerVertexFactory
    implements VertexFactory<Integer>
{
    private int counter = 0;

    public IntegerVertexFactory()
    {
        this(0);
    }

    public IntegerVertexFactory(int counter)
    {
        this.counter = counter;
    }

    @Override
    public Integer createVertex()
    {
        return counter++;
    }

}
