/*
 * pasdroid - An open source implementation of Password Maker for the
 * Android platform, written in Java
 * 
 * Copyright (C) 2010 Devin Quirozoliver
 * http://arik181.github.com/pasdroid
 * http://github.com/arik181/pasdroid
 * http://passwordmaker.org/
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *  
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Written by Devin Quirozoliver <arik181@hotmail.com>
 * 
 * Original Command Line Client Written by Miquel Burns 
 * <miquelfire@gmail.com> and Eric H. Jung
*/

//package net.arik181.pasdroid;

/**
 * @author arik181
 *
 */
interface PmHashBuilder {

    public void setOptions(String user, String mod);
    public void setTrim(int length); // Default 8 char
    public void setCharSet(String charset); 
    public void setLeet(int leetlevel); // Leet is off by default
    public void setPrefix(String prefix);
    public void setSuffix(String suffix);
    public String getHash(String masterPassword, String url);

}
