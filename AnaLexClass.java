/* The following code was generated by JFlex 1.7.0 */

/***************************************************************************************************
#
# LPyP (2019-20) - PED1 - LPPAnalizadorLexico.flex 
#
# @author       Jose Alvarez Morales
# @version      v3.0
# @Date 		20200523
# IMPLEMENTED: 	a por los comm. anidados!! lin.51-60, lin83-84, lin120-128.
# 
# LPPAnalizadorLexico.flex - Define el Analizador Lexico a utilizar, dentro de un programa de Java.
#               			 Quedará impementado como una clase de Java.
# 
# @param	Sin parametros.
# @return	Generará una clase de Java .java (con el nombre indicado en %class)(lin.20) 
#
****************************************************************************************************/
/* Sección de declaraciones de JFlex */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>LPPAnalizadorLexico.flex</tt>
 */
public class AnaLexClass {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\7\1\43\1\43\1\10\22\0\1\6\1\0\1\35"+
    "\1\12\2\0\1\36\1\0\1\35\1\35\1\3\1\4\1\35\1\4"+
    "\1\4\1\5\12\2\1\0\1\35\1\4\1\37\1\4\2\0\1\1"+
    "\1\1\4\1\2\1\1\1\4\1\2\1\2\1\1\1\1\1\1\1"+
    "\6\1\1\35\1\0\1\35\3\0\1\26\1\1\1\30\1\13\1\14"+
    "\1\15\1\1\1\34\1\16\2\1\1\20\1\25\1\17\1\22\1\27"+
    "\1\1\1\23\1\21\1\24\1\31\1\32\1\33\3\1\1\35\1\42"+
    "\1\35\7\0\1\43\33\0\1\41\40\0\1\40\u1f65\0\1\43\1\43"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\1\1\5"+
    "\2\6\1\7\1\1\11\2\2\10\1\4\2\1\1\11"+
    "\1\12\1\0\2\2\1\13\7\2\4\0\7\2\1\0"+
    "\1\14\1\0\3\2\1\0\1\2\1\0\1\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\44\0\264\0\330"+
    "\0\44\0\374\0\44\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0"+
    "\0\u01d4\0\u01f8\0\u021c\0\u0240\0\u0264\0\44\0\u0288\0\u02ac"+
    "\0\u02d0\0\u02f4\0\44\0\u0318\0\u033c\0\u0360\0\u0384\0\110"+
    "\0\u03a8\0\u03cc\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480\0\u02ac"+
    "\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\u0534\0\u0558\0\u057c\0\u05a0"+
    "\0\u05c4\0\u05e8\0\u060c\0\44\0\u0630\0\u0654\0\u0678\0\u069c"+
    "\0\u06c0\0\u06e4\0\u0708\0\44";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\3\1\15\1\16\1\17\2\3"+
    "\1\20\1\3\1\21\1\3\1\22\1\3\1\23\2\3"+
    "\1\24\1\25\1\3\1\26\1\27\1\30\1\31\1\2"+
    "\1\32\46\0\2\3\10\0\22\3\11\0\1\4\46\0"+
    "\1\33\41\0\1\34\46\0\1\10\44\0\1\11\47\0"+
    "\1\35\31\0\2\3\10\0\5\3\1\36\14\3\10\0"+
    "\2\3\10\0\7\3\1\37\12\3\10\0\2\3\10\0"+
    "\2\3\1\40\1\3\1\41\15\3\10\0\2\3\10\0"+
    "\11\3\1\42\10\3\10\0\2\3\10\0\1\3\1\43"+
    "\20\3\10\0\2\3\10\0\13\3\1\44\6\3\10\0"+
    "\2\3\10\0\10\3\1\45\11\3\10\0\2\3\10\0"+
    "\7\3\1\46\12\3\10\0\2\3\10\0\21\3\1\47"+
    "\45\0\1\6\44\0\1\6\45\0\1\50\44\0\1\6"+
    "\1\0\3\51\1\52\40\51\14\0\1\53\30\0\2\3"+
    "\10\0\6\3\1\54\13\3\10\0\2\3\10\0\10\3"+
    "\1\40\11\3\10\0\2\3\10\0\11\3\1\40\10\3"+
    "\10\0\2\3\10\0\10\3\1\55\11\3\10\0\2\3"+
    "\10\0\11\3\1\56\10\3\10\0\2\3\10\0\3\3"+
    "\1\57\16\3\10\0\2\3\10\0\3\3\1\60\16\3"+
    "\10\0\2\3\10\0\3\3\1\61\16\3\10\0\2\3"+
    "\10\0\3\3\1\62\16\3\7\0\3\51\1\63\40\51"+
    "\3\0\1\52\1\0\1\64\53\0\1\65\27\0\2\3"+
    "\10\0\1\3\1\40\20\3\10\0\2\3\10\0\16\3"+
    "\1\66\3\3\10\0\2\3\10\0\16\3\1\67\3\3"+
    "\10\0\2\3\10\0\4\3\1\40\15\3\10\0\2\3"+
    "\10\0\4\3\1\70\15\3\10\0\2\3\10\0\1\40"+
    "\21\3\10\0\2\3\10\0\5\3\1\54\14\3\7\0"+
    "\3\51\1\63\1\51\1\64\36\51\16\0\1\71\26\0"+
    "\2\3\10\0\15\3\1\41\4\3\10\0\2\3\10\0"+
    "\10\3\1\57\11\3\10\0\2\3\10\0\11\3\1\72"+
    "\10\3\26\0\1\73\25\0\2\3\10\0\3\3\1\40"+
    "\11\3\1\40\4\3\23\0\1\74\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1836];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\2\1\1\11\1\1\1\11"+
    "\12\1\1\11\4\1\1\11\1\1\1\0\12\1\4\0"+
    "\7\1\1\0\1\11\1\0\3\1\1\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */


 /* Código personalizado */
 
 // El método masTokens, permite confirmar si quedan más tokens por procesar
 
 private boolean _masTokens = false;
 
 public boolean masTokens(){
 return this._masTokens;
 }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnaLexClass(java.io.Reader in) {
   /* Código que se ejecutará en el constructor de la clase */
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 /*
 this._existenTokens = false;
 */
// Verifica que no quedan comentarios sin cerrar.

// PRUEBA-COMENT
int commentCount = 0;
if (commentCount>0){
	LexicalError error = new LexicalError ("Comentario sin cerrar");
	error.setLine (yyline + 1);
	error.setColumn (yycolumn + 1);
	error.setLexema (yytext ());
	lexicalErrorManager.lexicalFatalError (error);
}

// FIN PRUEBA-COMENT


    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public LPPToken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { LPPToken t = new LPPToken(yytext(), "ERROR LEXICO");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 13: break;
          case 2: 
            { LPPToken t = new LPPToken(yytext(), "IDENTIFICADOR");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 14: break;
          case 3: 
            { LPPToken t = new LPPToken(yytext(), "CONSTANTE");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 15: break;
          case 4: 
            { LPPToken t = new LPPToken(yytext(), "OPERADOR");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 16: break;
          case 5: 
            { // Ignorar cuando se inserte un espacio
            } 
            // fall through
          case 17: break;
          case 6: 
            { // Ignorar cuando se inserte un salto de linea
            } 
            // fall through
          case 18: break;
          case 7: 
            { // Ignorar cuando se inserte una tabulacion
            } 
            // fall through
          case 19: break;
          case 8: 
            { LPPToken t = new LPPToken(yytext(), "DELIMITADOR");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 20: break;
          case 9: 
            { commentCount--;
            } 
            // fall through
          case 21: break;
          case 10: 
            { commentCount++;
            } 
            // fall through
          case 22: break;
          case 11: 
            { LPPToken t = new LPPToken(yytext(), "PALABRA RESERVADA");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 23: break;
          case 12: 
            { LPPToken t = new LPPToken(yytext(), "COMENTARIO");
 this._masTokens = true;
 return t;
            } 
            // fall through
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
