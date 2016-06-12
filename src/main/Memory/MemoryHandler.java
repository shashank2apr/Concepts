package main.Memory;

public final class MemoryHandler {

	  private MemoryHandler() {}

	  public static long freeMemory() { return Runtime.getRuntime().freeMemory(); }

	  public static long totalMemory() { return Runtime.getRuntime().totalMemory(); }

	  public static String toLog() {
	      return "free:[" + freeMemory() + "] " + "total:[" + totalMemory() + "]";
	  }

	}