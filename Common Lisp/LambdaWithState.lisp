(defun f ()
    (funcall
	(lambda () 
		(defvar *counter* 0)
		(setf *counter* (+ *counter* 1))
		*counter*
	)
    )
)
(f)
(f)
(f)
