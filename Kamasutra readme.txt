Each letter of the alphabet is paired with one other letter. A
ciphertext was formed by replacing each letter in the plaintext with its paired letter.

For example, suppose the keyfile is just a regular alphabet as follows.
abcdefghijklmnopqrstuvwxyz

Then, suppose the plaintext contains of the following
abab bcbc cdcd

The resulting ciphertext would be
baba adad dcdc

Using command prompt:
Compile -
javac Kamasutra.java

Run-
- To generate random keyfile. 
java kamasutra -k keyfile.txtsts

- To encrypt plaintext.txt
java kamasutra -e keyfile.txt plaintext.txt ciphertext.txt

- To decrypt ciphertext.txt
java kamasutra -d keyfile.txt ciphertext.txt plaintext.txt