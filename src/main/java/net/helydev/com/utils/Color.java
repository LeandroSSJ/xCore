package net.helydev.com.utils;

import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

public class Color {

    public static String translate(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static List<String> translate(List<String> s) {
        return s.stream().map(Color::translate).collect(Collectors.toList());
    }
}

