addr0	ffff
immram	0000
out0	0000	:start
addr0	ffff
addr1	0001
immram	0001
each
	addr0	ffff
	jram	*
	out0	0000	>zero
	out0	0000	>one
	addr1	0001	:zero
	jram	0001
	reg0	*	:endf
	reg1	*	:endf
	addr1	0001	:one
	jram	0001
	reg1	*	:endf
	reg0	*	:end
	immram	0000	>endf
	jreg	*	>end
	out0	*
	out1	*
addr0	ffff
regram		>start
