/******************************************************************************
 *
 *  2015 (C) Copyright Open-RnD Sp. z o.o.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/

package pl.openrnd.managers.fragmentsswapper.sample.fragment;

import pl.openrnd.managers.fragmentsswapper.SwapParams;
import pl.openrnd.managers.fragmentsswapper.sample.R;

public class Screen4Fragment extends BaseScreenFragment {

    public static Screen4Fragment newInstance() {
        return new Screen4Fragment();
    }

    @Override
    protected int getColorResId() {
        return R.color.screen_4;
    }

    @Override
    protected int getFragmentReqId() {
        return 4;
    }

    @Override
    protected boolean isLastFragment() {
        return true;
    }

    @Override
    protected void onNextFragmentRequested(SwapParams swapParams) {

    }
}
