// Copyright 2016 Sebastian Kuerten
//
// This file is part of chromaticity.
//
// chromaticity is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// chromaticity is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with chromaticity. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.chromaticity;

import java.awt.Color;

public class AwtColors
{

	public static Color convert(ColorCode c)
	{
		return new Color(c.getValue(), true);
	}

}
