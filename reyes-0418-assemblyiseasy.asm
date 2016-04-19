global _start
	section .text
_start:
	; write(1, message,13)
	mov rax, 1	;system call 1 is write
	mov rdi, 1	;file handle 1 is stdout
	movrsi, message	;address of string to poutput
	mov rdx, 15	;number of bytes
	syscall		;invoke operating system to do the write


	; exit(0)
	mov	eax, 60		;system call 60 is exit
xor	rdi, rdi		;exit 0
syscall		;invoke operating system to exit
message:
	db	"was this easy", 10	;note the new line at the end

