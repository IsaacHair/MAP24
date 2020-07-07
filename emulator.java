import java.io.*;
import java.util.*;

class emulator {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("provide a rom file you fuck");
			return;
		}
		emulator machine = new emulator(args[0]);
	}
	private byte rom[0x10000][5];
	private short ram[0x10000];
	private short curr;
	private short nxt;
	private short addr;
	private short dir;
	private short out;
	private short reg;
	public emulator(String sourceName) {
		rom = new byte[0x10000][5];
		ram = new short[0x10000];
		FileInputStream source = new FileInputStream(sourceName);
		curr = 0x0000;
		for (int i = 0; source.read(rom[i]) > 0; i++)
			;
		source.close();
	}
}
