import { Button } from '@/components/ui/button';
import { Form, FormControl, FormField, FormItem, FormMessage } from '@/components/ui/form';
import { Input } from '@/components/ui/input';
import React from 'react'
import { useForm } from 'react-hook-form';

const Login = () => {
    const form=useForm({
                //resolver:zod
                defaultValues:{
                    email:"",
                    password:""
                },
            });
        
            const onSubmit=(data)=>{
                console.log("create project data",data);
            }
  return (
    <div className='space-y-5'>
        <p>Register</p>
        <Form {...form}>
            <form className="space-y-5" onSubmit={form.handleSubmit(onSubmit)}>
            
                
                <FormField control={form.control}
                name="fullName"
                render={({field})=>
                <FormItem>
                    <FormControl>
                        <Input 
                            {...field}
                            type="text"
                            className="border w-full border-gray-700 py-5 px-5"
                            placeholder="full name"
                        />
                    </FormControl>
                    <FormMessage/>
                </FormItem>}
                />

                <FormField control={form.control}
                name="password"
                render={({field})=>
                <FormItem>
                    <FormControl>
                        <Input 
                            {...field}
                            type="text"
                            className="border w-full border-gray-700 py-5 px-5"
                            placeholder="password"
                        />
                    </FormControl>
                    <FormMessage/>
                </FormItem>}
                />
               
                
                    
                        <Button type="submit" className="w-full mt-5">
                            Register
                        </Button>
                    
                
            </form>
        </Form>
    </div>
  )
}

export default Login