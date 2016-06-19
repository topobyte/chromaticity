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

public enum WebColors {

	WHITE(0xFFFFFF),
	SILVER(0xC0C0C0),
	GRAY(0x808080),
	BLACK(0x000000),

	RED(0xFF0000),
	MAROON(0x800000),
	YELLOW(0xFFFF00),
	OLIVE(0x808000),
	LIME(0x00FF00),
	GREEN(0x008000),
	AQUA(0x00FFFF),
	TEAL(0x008080),
	BLUE(0x0000FF),
	NAVY(0x000080),
	FUCHSIA(0xFF00FF),
	PURPLE(0x800080);

	private ColorCode color;

	private WebColors(int value)
	{
		color = new ColorCode(value);
	}

	public ColorCode color()
	{
		return color;
	}

}
