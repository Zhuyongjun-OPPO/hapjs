/*
 * Copyright (c) 2021, the hapjs-platform Project Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hapjs.card.api;

import java.util.List;

public interface GetAllAppsListener {
    void onAllApps(List<AppInfo> appInfos);
}