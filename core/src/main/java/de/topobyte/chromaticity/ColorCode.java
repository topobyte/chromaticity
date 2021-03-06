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

public class ColorCode
{

	private int value = 0xff000000;

	public ColorCode(int rgb)
	{
		value = 0xff000000 | rgb;
	}

	public ColorCode(int rgba, boolean hasalpha)
	{
		if (hasalpha) {
			value = rgba;
		} else {
			value = 0xff000000 | rgba;
		}
	}

	public ColorCode(int r, int g, int b)
	{
		this(r, g, b, 255);
	}

	public ColorCode(int r, int g, int b, int a)
	{
		value = ((a & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8)
				| ((b & 0xFF) << 0);
	}

	public ColorCode(float r, float g, float b)
	{
		this(int255(r), int255(g), int255(b));
	}

	public ColorCode(float r, float g, float b, float a)
	{
		this(int255(r), int255(g), int255(b), int255(a));
	}

	private static int int255(float f)
	{
		return (int) (f * 255 + 0.5);
	}

	public int getValue()
	{
		return value;
	}

	@Override
	public String toString()
	{
		return String.format("0x%X", value);
	}

	public int getAlpha()
	{
		return (value >> 24) & 0xFF;
	}

	public int getRed()
	{
		return (value >> 16) & 0xFF;
	}

	public int getGreen()
	{
		return (value >> 8) & 0xFF;
	}

	public int getBlue()
	{
		return value & 0xFF;
	}

	public void setAlpha(int a)
	{
		value = (value & 0x00ffffff) | ((a & 0xff) << 24);
	}

	public void setRed(int r)
	{
		value = (value & 0xff00ffff) | ((r & 0xff) << 16);
	}

	public void setGreen(int g)
	{
		value = (value & 0xffff00ff) | ((g & 0xff) << 8);
	}

	public void setBlue(int b)
	{
		value = (value & 0xffffff00) | (b & 0xff);
	}

	// Mimics behavior from java.awt.Color
	public float[] getRGBColorComponents(float[] output)
	{
		float[] f;
		if (output == null) {
			f = new float[3];
		} else {
			f = output;
		}
		f[0] = f1(getRed());
		f[1] = f1(getGreen());
		f[2] = f1(getBlue());
		return f;
	}

	// Mimics behavior from java.awt.Color
	public float[] getRGBComponents(float[] output)
	{
		float[] f;
		if (output == null) {
			f = new float[4];
		} else {
			f = output;
		}
		f[0] = f1(getRed());
		f[1] = f1(getGreen());
		f[2] = f1(getBlue());
		f[3] = f1(getAlpha());
		return f;
	}

	private float f1(int red)
	{
		return red / 255f;
	}

}
