/*
 * Copyright (C) 2020 Muntashir Al-Islam
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class ParceledListSlice<T extends Parcelable> {
    public List<T> getList() {
        return null;
    }

    public void writeToParcel(Parcel dest, int flags) {}

    public static final Parcelable.ClassLoaderCreator<ParceledListSlice> CREATOR = new Parcelable.ClassLoaderCreator<ParceledListSlice>() {
        public ParceledListSlice createFromParcel(Parcel var1) {
            throw new UnsupportedOperationException();
        }

        public ParceledListSlice createFromParcel(Parcel var1, ClassLoader var2) {
            throw new UnsupportedOperationException();
        }

        public ParceledListSlice[] newArray(int var1) {
            throw new UnsupportedOperationException();
        }
    };
}
