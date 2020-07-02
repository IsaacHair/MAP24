this will be an assembly language with 11 instructions:
jin
jram
out0
out1
addr0
addr1
reg0
reg1
regram
immram
jreg

everything must be manually specified, but:
- you do not have to manually label things
- j* statements automatically get placed at an odd address
- there is a special block to repeat the operation for each bit
- there are labels and gotos; label with :label and goto with >label

The special block is called "each" and cannot be nested.
Labels within "each" are created there and only used there.
They reset for each iteration.
Global lables can also be created, but only outside "each" loops.
Comments are inside "\" and "\".
No blank lines.
Each "\" and "\" to begin/end comment must be on a seperate line.
Use "\" then newline then "\" if you want to space out the code.

updated mais for map 24.3:
join
jain
joram
jaram
joreg
jareg
out0
out1
addr0
addr1
dir0
dir1
reg0
reg1
immram
regram
