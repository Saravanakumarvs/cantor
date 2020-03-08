/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package com.salesforce.cantor.misc.rw;

import com.salesforce.cantor.Cantor;
import com.salesforce.cantor.common.AbstractBaseSetsTest;

import java.io.IOException;

public class ReadWriteSetsTest extends AbstractBaseSetsTest {
    @Override
    public Cantor getCantor() throws IOException {
        return ReadWriteTests.getCantor();
    }
}