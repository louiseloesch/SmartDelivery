/*
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.language.constants;

import com.oracle.truffle.api.frame.VirtualFrame;
import org.jruby.truffle.language.RubyConstant;

public interface LookupConstantInterface {

    public abstract RubyConstant lookupConstant(VirtualFrame frame, Object module, String name);

}
